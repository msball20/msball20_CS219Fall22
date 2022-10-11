package HW5;

public class Exercise66 {

    public static boolean canSpell(String word, String tiles) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            for (int z = 0; z < tiles.length(); z++) {
                if (word.charAt(i) == tiles.charAt(z)) {
                    tiles = tiles.substring(0,z) + tiles.substring(z+1);
                    count++;
                    break;
                }
            }
            if (count == word.length()) {
                return true;
            }

        }
        return false;
    }


    public static void main(String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));

        // Student: add more test cases
        System.out.println(canSpell("box", "axobasrto"));
        System.out.println(!canSpell("heart", "haxobapsrito"));
        System.out.println(canSpell("bars", "axobasrto"));
        System.out.println(!canSpell("wrap", "haxobapsrito"));



    }
}

