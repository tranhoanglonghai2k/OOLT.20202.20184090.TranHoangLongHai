package hust.soict.hedspi.aims.utils;

public class Month {
    private static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};

    public static int Translate(String _fullName)
    {
        switch(_fullName)
        {
            case "January":
            {
                return 1;
            }

            case "February":
            {
                return 2;
            }

            case "March":
            {
                return 3;
            }

            case "April":
            {
                return 4;
            }

            case "May":
            {
                return 5;
            }

            case "June":
            {
                return 6;
            }

            case "July":
            {
                return 7;
            }

            case "August":
            {
                return 8;
            }

            case "September":
            {
                return 9;
            }

            case "October":
            {
                return 10;
            }

            case "November":
            {
                return 11;
            }

            case "December":
            {
                return 12;
            }

            default:
                return 0;
        }
    }

    public static String GetInLetter(int x)
    {
        return months[x - 1];
    }
}