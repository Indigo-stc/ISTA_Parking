package Validaciones;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Val {
    
    public static boolean isNumber(String cedula) {
        return (cedula.matches("[0-9]*") && cedula.length() == 10);
    }
    
    public static boolean hollow(String cadena) {
        return (cadena == null || cadena.trim().equals(""));
    }
    
    public static boolean email(String email) {
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
    
    public static boolean edad(Date birth) {
        if (birth != null) {
            Date current = new Date();
            SimpleDateFormat format_current = new SimpleDateFormat("YYYY");
            String año_current = format_current.format(current);
            SimpleDateFormat manner2 = new SimpleDateFormat("YYYY");
            String año_nac = manner2.format(birth);
            return (Integer.parseInt(año_current) - Integer.parseInt(año_nac)) >= 18;
        } else {
            return false;
        }      
    }
    
    public static boolean ID(String id) {
        return (id.length() != 7);
    }
    
    public static boolean Precio(double precio){
        if(String.valueOf(precio).matches("[0-9]*{5}")){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean Fecha(Date fecha_Rsrv, Date fechaIngreso){
        return fecha_Rsrv.getTime()<fechaIngreso.getTime();
    }
    
    public static boolean digVfy(String cedula) {
        byte sum = 0;
        try {
            if (cedula.length() != 10)
                return false;
            String[] data = cedula.split("");
            byte verifier = Byte.parseByte(data[0] + data[1]);
            if (verifier < 1 || verifier > 24)
                return false;
            byte[] digits = new byte[data.length];
            for (byte i = 0; i < digits.length; i++)
                digits[i] = Byte.parseByte(data[i]);
            if (digits[2] > 6)
                return false;
            for (byte i = 0; i < digits.length - 1; i++) {
                if (i % 2 == 0) {
                    verifier = (byte) (digits[i] * 2);
                    if (verifier > 9)
                        verifier = (byte) (verifier - 9);
                } else
                    verifier = (byte) (digits[i] * 1);
                sum = (byte) (sum + verifier);
            }
            if ((sum - (sum % 10) + 10 - sum) == digits[9])
                return true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean contraseña(String cadena) {
        Pattern pattern = Pattern
                .compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])"
                        + "(?=\\S+$).{8,}$");
        Matcher mather = pattern.matcher(cadena);
        return mather.find();
    }
    
    public static boolean usuario(String cadena) {
        return (cadena.length() >= 8 && cadena.length() <= 10);
    }
    
    public static boolean placa(String placa){
        return placa.matches("^[A-Z]{3}-[0-9]{3,4}$");
    }
}
