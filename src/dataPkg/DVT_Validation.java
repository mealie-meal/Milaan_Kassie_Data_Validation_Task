package dataPkg;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class DVT_Validation
{
    //VALIDATION TYPE 1 - FORMAT CHECK - DONE
    public static boolean vInitialsCheck(String entry, int numChars, String entryCondition, String fieldName, javax.swing.JLabel label)
    {
        boolean valid = false;

        String toCheck = ""; //builing a string of the initials that we must check
        for (int i = 0; i < numChars; i++)  //this forloop builds the string by checking how many initials we're checking
        {
            toCheck += entry.charAt(i);
        }

        if (toCheck.equals(entryCondition))
        {
            valid = true;
            label.setForeground(new Color(60, 179, 113));
            label.setText("-");
        } else
        {
            label.setForeground(Color.RED);
            label.setText("Entry must begin with the characters: '" + entryCondition + "'");
        }
        return valid;
    }

    
    
    
    
    
    
    
    
    //VALIDATION TYPE 2 - RANGE CHECK - DONE
    public static boolean vIntegerRange(String entryString, int min, int max, String fieldName, javax.swing.JLabel label)
    {
        boolean valid = false;
        int entry = Integer.parseInt(entryString);
        if (entry <= max && entry >= min)
        {
            valid = true;
            label.setForeground(new Color(60, 179, 113));
            label.setText("-");
        } else
        {
            label.setForeground(Color.RED);
            label.setText("Entry must fall between the range: " + min + " and " + max);
        }
        return valid;
    }

    
    
    
    
    
    
    
    
    
    
    //VALIDATION TYPE 3 - LENGTH CHECK - DONE
    public static boolean vStringRange(String entry, int minChars, int maxChars, String fieldName, javax.swing.JLabel label)
    {
        boolean valid = false;

        if (entry.length() >= minChars && entry.length() <= maxChars) //check if its within bounds
        {
            valid = true; //yes its within bounds so we return true 
            label.setForeground(new Color(60, 179, 113));
            label.setText("-");
        } else
        {
            label.setForeground(Color.RED);
            label.setText("Entry must be " + minChars + " - " + maxChars + " characters in length");
        }

        return valid;
    }
    
    
    
    
    
    
    
    //VALIDATION TYPE 3.1 - LENGTH CHECK - DONE
    public static boolean vStringLengthCheck(String entry, int numChars, String fieldName, javax.swing.JLabel label)
    {
        boolean valid = false;

        if (entry.length() == numChars) //check if its within bounds
        {
            valid = true;
            label.setForeground(new Color(60, 179, 113));
            label.setText("-");
        } else
        {
            label.setForeground(Color.RED);
            label.setText("Entry must be " + numChars + " characters in length");
        }

        return valid;
    }

    //VALIDATION TYPE 4 - DATA TYPE CHECK (INTEGER) - DONE
    public static boolean vInteger(String data, String fieldName, javax.swing.JLabel label)
    {
        boolean valid = false;
        try
        {
            Integer.parseInt(data);
            valid = true;

        } catch (NumberFormatException e)
        {
            valid = false;
        }

        if (valid)
        {
            label.setForeground(new Color(60, 179, 113));
            label.setText("-");

        } else
        {
            label.setForeground(Color.RED);
            label.setText("Entry must be an integer value");
        }
        return valid;
    }

    //this is a PRESENCE CHECK TYPE METHOD
    //somehow this works???  it works, whatever
//    public static boolean vStringPresenceCheck(String entry, String fieldName, javax.swing.JLabel label)
//    {
//        boolean valid = true;
//
//        //this doesnt work any other way. dont break it please
//        if (!(!(entry.isEmpty()) && !(Character.isWhitespace(entry.charAt(0)))))
//        {
//            //JOptionPane.showMessageDialog(null, "Entry cannot be left blank", "Invalid data entry in " + fieldName + " field", JOptionPane.ERROR_MESSAGE);
//            label.setForeground(Color.RED);
//            label.setText("Entry cannot be left blank");
//
//            valid = false;
//
//        } else
//        {
//            valid = true;
//        }
//
//        return valid;
//    }

//    public static boolean vDateWithinAWeek(Date dateToCheck, String fieldName)
//    {
//        boolean valid = false;
//
//        //getting the current date
//        Date currentDate = new Date();
//
//        //creating a calendar object and setting it to todays date which we just instantiated and initialised
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(currentDate);
//
//        //minusing 7 days from todays date
//        calendar.add(Calendar.DAY_OF_YEAR, -8);
//        Date weekAgoDate = calendar.getTime();
//
//        if (!dateToCheck.before(weekAgoDate))
//        {
//            valid = true;
//        } else
//        {
//            JOptionPane.showMessageDialog(null, "Date cannot be more than a week ago", "Invalid data entry in " + fieldName + " field", JOptionPane.ERROR_MESSAGE);
//        }
//        // Check if the date to check is after the date a week ago
//        return valid;
//    }
}
