/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usehotelroom;

/**
 *
 * @author TEBALELO MADUMETSA
 */
public class Suite extends HotelRoom{

    public Suite(int RoomNo) {
        super(RoomNo);
        System.out.println("Total price: " + (dblNightlyRentalRate + 638));
    }
    
}
