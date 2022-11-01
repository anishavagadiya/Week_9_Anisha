package calculate;
// Write the programme that tell you which line pass through particular stations.
// Just use Zone 1 stations name.

import java.util.*;

public class Programme_10 {
String [] Zone1 = {"Oxford Circus", "Green Park","Euston Square", "Bond Street"};
String [] JubileLine = new String[]{"Green Park", "Bond Street"};
String [] metropolitanLine = new String[]{"Euston Square"};
String [] centalLine = new String[]{"Oxford Circus", "Bond Street"};

    public static void main(String[] args) {
        Programme_10 obj = new Programme_10();
        Boolean found = false;

        for (String sname : obj.Zone1) {
            System.out.println(sname);

        }
        System.out.println();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Londo Zone 1 Station: ");
        String Station = read.nextLine().toLowerCase();
        read.close();
        System.out.println(Station);

        //check if station is present on jubileeLine
        List<String> nameList = new ArrayList<>(Arrays.asList(obj.JubileLine));
        if (nameList.contains(Station)) {
            System.out.println("Station found on Jubilee Line");
            found = true;
        }
        //Check if station present in metropolitanline
        nameList = new ArrayList<>(Arrays.asList(obj.metropolitanLine));
        if (nameList.contains(Station)) {
            System.out.println("Station found on Jubilee Line");
            found = true;

        }
        //check if station is present in cental line
        nameList = new ArrayList<>(Arrays.asList(obj.centalLine));
        if (nameList.contains(Station)) {
            System.out.println("Station found on Jubilee Line");
            found = true;
        }


    }
}