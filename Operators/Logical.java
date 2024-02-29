package Operators;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Logical {
    public static void main(String[] args) {
        //Logical Operators in Java

        /**
         * && AND 
         * || OR
         * ! Not
         */

        boolean wifi = false; 
        boolean mobileData = false;
        boolean deviceOnline = true;

        if (mobileData && deviceOnline) {
            System.out.println("Your Device and Internet Connection is Online:)");
        }else if (!wifi&&!mobileData) {
            System.out.println("Your Internet is offline");
        }else if (wifi||mobileData) {
            System.out.println("Online");
        }

    }
}
