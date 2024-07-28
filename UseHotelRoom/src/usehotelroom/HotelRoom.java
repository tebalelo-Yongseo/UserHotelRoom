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
public class HotelRoom {
    
    int intRoomNumber;
    double dblNightlyRentalRate;
    
    public int getIntRoomNumber() {
        return intRoomNumber;
    }

    public double getDblNightlyRentalRate() {
        return dblNightlyRentalRate;
    }
    
    public HotelRoom(int RoomNo)     
    {
        this.intRoomNumber = RoomNo;
        
        if(RoomNo <= 299)
        {
            dblNightlyRentalRate = 1116.83;
        }
        else
        {
             dblNightlyRentalRate = 1436.14;
        }
        
       // System.out.println("Price before tax " + dblNightlyRentalRate);
    }
    
}