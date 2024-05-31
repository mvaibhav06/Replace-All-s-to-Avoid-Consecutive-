class ReplaceChars {
    public char giveChar(char a, char b){
        List<Character> temp = List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

        for(int i=0; i<26; i++){
            if(a!=temp.get(i) && b!=temp.get(i)){
                return temp.get(i);
            }
        }
        return ' ';
    }
    public String modifyString(String s) {
        char[] temp = s.toCharArray();

        for(int i=0; i<temp.length; i++){
            if(temp[i]=='?'){
                if(i==0 || i==temp.length-1){
                    if(i==0){
                        if(i==0 && i==temp.length-1){
                            temp[i] = 'a';
                            break;
                        }
                        char ch = giveChar(temp[i+1],' ');
                        temp[i] = ch;
                    }else{
                        char ch = giveChar(temp[i-1],' ');
                        temp[i] = ch;
                    }
                }else{
                    char ch = giveChar(temp[i-1],temp[i+1]);
                    temp[i] = ch;
                }
                
            }
        }
        return new String(temp);
    }
}
