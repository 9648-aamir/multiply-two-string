public class Check_if_strings_are_rotations_of_each_other_or_not {
    public static boolean areRotations(String s1, String s2 ){
        s1 = s1 + s1;
        return s1.contains(s2);
    }
}
