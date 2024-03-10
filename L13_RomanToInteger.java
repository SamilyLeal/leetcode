public class L13_RomanToInteger {
    public int romanToInt(String s) {
        int n = 0, l = s.length() - 1;

        for (int i = 0; i <= l; i++){
            switch (s.charAt(i)) {
                case 'I':
                    if(i != l && s.charAt(i + 1) == 'V'){
                        n += 4;
                        i++;
                        break;
                    } else if(i != l && s.charAt(i + 1) == 'X'){
                        n += 9;
                        i++;
                        break;
                    }

                    n++;
                    break;
                case 'V':
                    n += 5;
                    break;
                case 'X':
                    if(i != l && s.charAt(i + 1) == 'L'){
                        n += 40;
                        i++;
                        break;
                    } else if (i != l && s.charAt(i + 1) == 'C'){
                        n += 90;
                        i++;
                        break;
                    }

                    n += 10;
                    break;
                case 'L':
                    n += 50;
                    break;
                case 'C':
                    if(i != l && s.charAt(i + 1) == 'D'){
                        n += 400;
                        i++;
                        break;
                    } else if(i != l && s.charAt(i + 1) == 'M'){
                        n += 900;
                        i++;
                        break;
                    }

                    n += 100;
                    break;
                case 'D':
                    n += 500;
                    break;
                case 'M':
                    n += 1000;
                    break;
                default:
                    break;
            }

        }

        return n;
    }
}
