public class Viacheslav_Hladkovskyi_easy_1 {
    public static void main( String[] args )
    {
        String s = "hello world yay";
        String[] word = s.split( " " );
        String rts = " ";

        for ( int i = 0; i < word.length; i++ )
        {
            if ( word[i].length() > rts.length() )
                rts = word[i];

        }
        System.out.println( rts );
    }
}
