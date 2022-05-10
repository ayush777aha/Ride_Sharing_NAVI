/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ridesharing.Exceptions;

/**
 *
 * @author AyushGarg
 */
public class InvalidUser extends RuntimeException{

    public InvalidUser() {
        super("Invalid User");
    }
    
}
