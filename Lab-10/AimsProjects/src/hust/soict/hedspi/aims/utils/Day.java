package hust.soict.hedspi.aims.utils;

public class Day {
    public static int Translate(String _inLetter)
    {
        switch (_inLetter)
        {
            case "first":
            {
                return 1;
            }

            case "second":
            {
                return 2;
            }

            case "third":
            {
                return 3;
            }

            case "fourth":
            {
                return 4;
            }

            case "fifth":
            {
                return 5;
            }

            case "sixth":
            {
                return 6;
            }

            case "seventh":
            {
                return 7;
            }

            case "eighth":
            {
                return 8;
            }

            case "nineth":
            {
                return 9;
            }

            case "tenth":
            {
                return 10;
            }

            case "eleventh":
            {
                return 11;
            }

            case "twelfth":
            {
                return 12;
            }

            case "thirteenth":
            {
                return 13;
            }

            case "fourteenth":
            {
                return 14;
            }

            case "fifteenth":
            {
                return 15;
            }

            case "sixteenth":
            {
                return 16;
            }

            case "seventeenth":
            {
                return 17;
            }

            case "eighteenth":
            {
                return 18;
            }

            case "nineteenth":
            {
                return 19;
            }

            case "twentieth":
            {
                return 20;
            }

            case "twenty first":
            {
                return 21;
            }

            case "twenty second":
            {
                return 22;
            }

            case "twenty third":
            {
                return 23;
            }

            case "twenty fourth":
            {
                return 24;
            }

            case "twenty fifth":
            {
                return 25;
            }

            case "twenty sixth":
            {
                return 26;
            }

            case "twenty seventh":
            {
                return 27;
            }

            case "twenty eighth":
            {
                return 28;
            }

            case "twenty ninth":
            {
                return 29;
            }

            case "thirtieth":
            {
                return 30;
            }

            case "thirty first":
            {
                return 31;
            }

            default:
                return 0;
        }
    }

    public static String Translate(int _inNumber)
    {
        switch (_inNumber)
        {
            case 1:
            {
                return "first";
            }

            case 2:
            {
                return "second";
            }

            case 3:
            {
                return "third";
            }

            case 4:
            {
                return "fourth";
            }

            case 5:
            {
                return "fifth";
            }

            case 6:
            {
                return "sixth";
            }

            case 7:
            {
                return "seventh";
            }

            case 8:
            {
                return "eighth";
            }

            case 9:
            {
                return "ninth";
            }

            case 10:
            {
                return "tenth";
            }

            case 11:
            {
                return "eleventh";
            }

            case 12:
            {
                return "twelfth";
            }

            case 13:
            {
                return "thirteenth";
            }

            case 14:
            {
                return "fourteenth";
            }

            case 15:
            {
                return "fifteenth";
            }

            case 16:
            {
                return "sixteenth";
            }

            case 17:
            {
                return "seventeenth";
            }

            case 18:
            {
                return "eighteenth";
            }

            case 19:
            {
                return "nineteenth";
            }

            case 20:
            {
                return "twentieth";
            }

            case 21:
            {
                return "twenty first";
            }

            case 22:
            {
                return "twenty second";
            }

            case 23:
            {
                return "twenty third";
            }

            case 24:
            {
                return "twenty fourth";
            }

            case 25:
            {
                return "twenty fifth";
            }

            case 26:
            {
                return "twenty sixth";
            }

            case 27:
            {
                return "twenty seventh";
            }

            case 28:
            {
                return "twenty eighth";
            }

            case 29:
            {
                return "twenty ninth";
            }

            case 30:
            {
                return "thirtieth";
            }

            case 31:
            {
                return "thirty first";
            }

            default:
                return " ";
        }
    }

    public static String GetOrdinal(int inNumber)
    {
        String Name = Translate(inNumber);
        return Name.substring(Name.length() - 2, Name.length());
    }

}