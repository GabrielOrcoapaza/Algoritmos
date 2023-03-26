/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package password;
import java.util.Random;
/**
 *
 * @author Gabriel
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password = generatePassword(8); // generar una contraseña de 8 caracteres
        String encryptedPassword = encryptWithASCII(password); // encriptar la contraseña utilizando el código ASCII
        System.out.println("Contraseña generada: " + password);
        System.out.println("Contraseña encriptada: " + encryptedPassword);
    }

    private static String generatePassword(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static String encryptWithASCII(String password) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            sb.append((int) password.charAt(i));
        }
        return sb.toString();
    }
    
}
