/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

public class ButtonValues {
    int value;
    int imageIndex;
    public ButtonValues(int index) {
        imageIndex = index;
        if (index >= 0 && index <= 3) {
            value = 2;
        }   else if (index >= 4 && index <= 7) {
            value = 3;
        }   else if (index >= 8 && index <= 11) {
            value = 4;
        }   else if (index >= 12 && index <= 15) {
            value = 5;
        }   else if (index >= 16 && index <= 19) {
            value = 6;
        }   else if (index >= 20 && index <= 23) {
            value = 7;
        }   else if (index >= 24 && index <= 27) {
            value = 8;
        }   else if (index >= 28 && index <= 31) {
            value = 9;
        }   else if (index >= 32 && index <= 35) {
            value = 10;
        }   else if (index >= 36 && index <= 39) {
            value = 1;
        }   else if (index >= 40 && index <= 43) {
            value = 11;
        }   else if (index >= 44 && index <= 47) {
            value = 12;
        }   else if (index >= 48 && index <= 51) {
            value = 13;
        }
    }
}


