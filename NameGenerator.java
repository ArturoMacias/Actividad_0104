
/**
 * Generates a StarWars name
 * 
 * @author Arturo
 * @version 1.0
 */
public class NameGenerator
{
    
    public final static int BEGIN_INDEX = 0;
    public final static int END_INDEX = 2;
    public final static int END_INDEX_2 = 3;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
    }

    /**
     * 
     * Your StarWars Name
     */
    public String generateStarWarsName(String surname,String name, String mumSurname, String birthPlace)
    {
        String part1 = surname.substring(BEGIN_INDEX,END_INDEX_2);
        String part2 = name.substring(BEGIN_INDEX,END_INDEX_2);
        String part3 = mumSurname.substring(BEGIN_INDEX,END_INDEX);
        String part4 = birthPlace.substring(BEGIN_INDEX,END_INDEX_2);
        String nombreStarWars = part1 + part2 + " " + part3 + part4;
        return nombreStarWars;
       
    }
}
