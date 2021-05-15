package hust.soict.hedspi.aims.utils;

public class Year {
    private static final String[] words1 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] word2 = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"};
    private static final String[] word3 = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static int exist(String s1, String[] s2)
    {
        for (int i = 0; i < s2.length; ++i)
        {
            if(s1.equals(s2[i]))
            {
                return i + 1;
            }
        }
        return 0;
    }

    public static int Translate(String inLetter)
    {
        int result = 0;
        String[] words = inLetter.split(" ", 5);

        if(exist(words[0], words1) != 0) {
            //2
            result = exist(words[0], words1);
            if(words[1].equals("thousand")) {
                //2000
                result *= 1000;
                if(words.length > 2) {
                    if (words[2].equals("and")) {
                        //2004
                        result += exist(words[3], words1);
                    }

                    if (exist(words[2], word2) != 0) {
                        //2012
                        result += 10 + exist(words[2], word2);
                    } else {
                        if (exist(words[2], word3) != 0) {
                            //2030
                            result += exist(words[2], word3) * 10;
                            if(words.length > 3) {
                                if (exist(words[3], words1) != 0) {
                                    //2034
                                    result += exist(words[3], words1);
                                }
                            }
                        }
                    }
                }
            }
        }else{
            if(exist(words[0], word2) != 0) {
                //19
                result += exist(words[0], word2) + 10;
                if(words[1].equals("hundred")) {
                    //1900
                    result *= 100;
                    if(words.length > 3)
                    {
                        if(exist(words[3], words1) != 0) {
                            //1903
                            result += exist(words[3], words1);
                        }
                    }
                }else{
                    if(exist(words[1], word2) != 0) {
                        //1912
                        result *= 100;
                        result += exist(words[1], word2) + 10;
                    }else{
                        if(exist(words[1], word3) != 0) {
                            //1940
                            result *= 100;
                            result += exist(words[1], word3) * 10;

                            if(words.length > 2) {
                                if(exist(words[2], words1) != 0) {
                                    //1945
                                    result += exist(words[2], words1);
                                }
                            }
                        }
                    }
                }
            }else{
                if(exist(words[0], word3) != 0) {
                    //20
                    result += exist(words[0], word3) * 10;
                    if(exist(words[1], words1) != 0) {
                        //21
                        result += exist(words[1], words1);
                        if(words[2].equals("hundred")) {
                            //2100
                            result *= 100;
                            if(words.length > 3) {
                                if(words[3].equals("and")) {
                                    //2102
                                    result += exist(words[4], words1);
                                }
                            }
                        }else{
                            if(exist(words[2], word2) != 0) {
                                //2112
                                result *= 100;
                                result += 10 + exist(words[2], word2);
                            }else{
                                if(exist(words[2], word3) != 0) {
                                    //2130
                                    result *= 100;
                                    result += exist(words[2], word3) * 10;

                                    if(words.length > 3)
                                    {
                                        if(exist(words[3], words1) != 0) {
                                            //2132
                                            result += exist(words[3], words1);
                                        }
                                    }
                                }
                            }
                        }
                    }else{
                        if(exist(words[1], word2) != 0)
                        {
                            //2012
                            result *= 100;
                            result += 10 + exist(words[1], word2);
                        }else{
                            if(exist(words[1], word3) != 0)
                            {
                                //2020
                                result *= 100;
                                result += 10 * exist(words[1], word3);

                                if(words.length > 2)
                                {
                                    if(exist(words[2], words1) != 0)
                                    {
                                        //2021
                                        result += exist(words[2], words1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
