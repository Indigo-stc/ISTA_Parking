package Validaciones;

import java.util.Date;

public class Validaciones {
    
    public static boolean justNumb(String cedula) {
        return (cedula.matches("[0-9]*") && cedula.length() == 10);
    }
    
    public static boolean hollow(String cadena) {
        return (cadena == null || cadena.trim().equals(""));
    }
    
    public static boolean arroba(String email) {
        return (email.contains("@"));
    }
    
    public static boolean edad(String edad) {
         return (Integer.parseInt(edad) >= 18);
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
        if(fecha_Rsrv.getTime()<fechaIngreso.getTime()){
            return true;
        }else{
            return false;
        }
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean contraseña(String cadena) {
        return (cadena.length() >= 8 && cadena.length() <= 10) 
                && cadena.matches("[A-Za-z0-9]+");
    }
    
    public static boolean usuario(String cadena) {
        return (cadena.length() <= 10);
    }
    
    
    /*public static boolean placa(String placa) {
        char[] verify = placa.toCharArray();
        int letra = 1;
        
        for (int i = 0; i < 3.; i++) {
            if (!Character.isLetter(placa.charAt(i))) {
                letra = 0;
            }
        }
        
        for (int i = 4; i < placa.length(); i++) {
            if ((Character.isLetter(placa.charAt(i))) ) {
                
            }
        }
    
        if (verify[3] != '-') 
    }*/
}
