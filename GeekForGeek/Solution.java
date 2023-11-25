import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.Node;

class Solution {
    public static Set<String > set=new HashSet< >();

    static {
        set.addAll(Arrays.asList("First Holidays" , "Big Milestones" , "Create your own", "Milestones in color", "Silver Ballons", "Pink Balloons", "Unicorn Balloons", "Ribbon Badges", "Circle Badges", "Animal numbers", "Cute animals", "Cute months ", "Floral numbers", "Starry numbers", "Activities", "Sleep", "Emotions", "Emoticons", "Endearments", "Love in Color", "Everyday in Color", "Badges & Banners", "Pop Art", "Fireworks", "Dividers", "Flags", "Hearts", "Love In Color", "Props", "Masks", "Stats", "This & That", "Gender Reveals", "Birth Announcements", "Measurements", "Announcements in Color", "Funny in Color", "Daddy", "Family", "Friends", "Friends & Family in Color", "Christmas", "Christmas Doodles", "Christmas in Color", "New Year", "New Year in Color", "Easter", "Easter in Color", "Halloween", "Halloween in Color", "Thanksgiving", "Thanksgiving in Color", "Mothers Day", "Mothers Day In Color", "Fathers Day", "Valentine’s Day", "Valentine’s Day in Color", "Happy Hanukkah", "Happy Ramadan", "Holidays in Color", "Birthday in Color", "Unicorn", "Party", "Summer", "Fall", "Winter", "School Bursts", "Gender Reveals", "Baby shower", "Pregnancy Milestones", "Bump Fruit Stickers", "Bump Fruit Badges", "Weekly Stickers", "Weekly Ribbon Badges", "Weekly Calendar Stickers", "Ribbon Due Dates", "Cute Due Dates", "Pregnancy in Color", "Gender Reveals", "Baby shower", "Pregnancy Milestones", "Bump Fruit Stickers", "Bump Fruit Badges", "Weekly Stickers", "Weekly Ribbon Badges", "Weekly Calendar Stickers", "Ribbon Due Dates", "Cute Due Dates", "Pregnancy in Color", "Gender Reveals", "Birth Announcements", "Measurements", "Announcements in Color", "Pink Balloons", "Unicorn Balloons", "Ribbon Badges", "Circle Badges", "Cute animals", "Cute months", "Floral numbers", "Starry numbers", "First Holidays", "Big Milestones", "Pregnancy Milestones", "Create Your Own", "Milestones in Color", "Activities", "Sleep", "Emotions", "Emoticons", "Endearments", "Love in Color", "Everyday in Color", "Badges & Banners", "Pop Art", "Fireworks", "Dividers", "Flags", "Hearts", "Love In Color", "Props", "Masks", "Stats", "This & That", "Daddy", "Family", "Friends", "Friends & Family in Color", "Christmas", "Christmas", "Christmas in Color", "New Year", "New Year in Color", "Easter", "Easter in Color", "Halloween", "Halloween in Color", "Thanksgiving", "Thanksgiving in Color", "Mothers Day", "Mothers Day In Color", "Fathers Day", "Valentine’s Day", "Valentine’s Day in Color", "Happy Hanukkah", "Happy Ramadan", "Holidays in Color", "Summer", "Fall", "Winter", "Funny in Color", "Birthday in Color", "Unicorn", "Party", "School Bursts" ));
    }
   
    public static void main(String[] args) {
        boolean cheack= set.contains("Animal Number");
       

    private Set<String> subtreeHashes = new HashSet<>();
    private boolean duplicateSubtreeFound = false;

    String func(Node root) {
        if (root == null)
            return "";

        String l = func(root.left);
        String r = func(root.right);

        String s = Integer.toString(root.data) + l + r;

        if (subtreeHashes.contains(s) && s.length() > 2) {
            duplicateSubtreeFound = true;
        }

        subtreeHashes.add(s);
        return s;
    }

    
    int dupSub(Node root) {
        // code here

        func(root);
        return duplicateSubtreeFound ? 1 : 0;
      }
}  
