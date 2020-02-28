package Package;

public class phone_Number {
    /*
    Format a phone-number
    IN : phone-number, format
    OUT : a well formated phone nUmber
     */
    public static String number_format(String pHone_Number, String format)
                                                                                                                        {
        int nb_Hashtag_In_Format = 0;
        for (int i = 0; i<format.length();i++)                                                                           {
            if (format.charAt(i) == '#')
                                                                                                                        {
                nb_Hashtag_In_Format++;
                                                                                                                         }
                                                                                                                        }
        char [] the_Final_String = new char[format.length()];
        int iteration_Counter_For_String = 0;
        int iteration_Counter_For_Number = 0;
        while (nb_Hashtag_In_Format > 0)                                                                                {
            if (format.charAt(iteration_Counter_For_String) != '#')                                                     {
                the_Final_String[iteration_Counter_For_String] = format.charAt(iteration_Counter_For_String);
                                                                                                                        }
            else{
                the_Final_String[iteration_Counter_For_String] = pHone_Number.charAt(iteration_Counter_For_Number);
                iteration_Counter_For_Number++;
                nb_Hashtag_In_Format--;
            }
            iteration_Counter_For_String++;
                                                                                                                        }
        StringBuilder the_True_Final_String = new StringBuilder();
        for (int i = 0; i<the_Final_String.length;i++)
                                                                                                                        {
            the_True_Final_String.append(the_Final_String[i]);
                                                                                                                         }
        return the_True_Final_String.toString();
                                                                                                                         }

    // Entering the main function
    public static void main (String[] args) {
        System.out.println(number_format("1234567890", "(###) ###-####"));
        System.out.println(number_format("07123456789", "##### ######"));
        System.out.println(number_format("01189998819991197253", "#### ### ### ### ### ### #"));
    }
}

// number_format('1234567890', '(###) ###-####') //(123) 456-7890
//number_format("07123456789", "##### ######") //07123 456789
//number_format("01189998819991197253", "#### ### ### ### ### ### #") //0118 999 881 999 119 725 3