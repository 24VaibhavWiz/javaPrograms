package iris;
import bijnum.BIJstats;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;
public class Feature implements Serializable
{

    public Feature(String name, float vector[])
    {
        this.vector = vector;
        this.name = name;
    }

    public Feature(String name, byte vector[])
    {
        float fv[] = new float[vector.length];
        for(int i = 0; i < vector.length; i++)
            fv[i] = vector[i];

        this.vector = fv;
        this.name = name;
    }

    public void unitvar()
    {
        vector = BIJstats.unitvar(vector);
    }

    public float[] toVector()
    {
        return vector;
    }

    public String toString()
    {
        return name;
    }

    public int length()
    {
        return vector.length;
    }

    @SuppressWarnings("rawtypes")
	public static float[][] toMatrix(Vector features)
    {
        float matrix[][] = new float[features.size()][];
        int i = 0;
        for(Enumeration e = features.elements(); e.hasMoreElements();)
            matrix[i++] = (float[])(float[])e.nextElement();

        return matrix;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static Vector add(Vector features, Feature newfeatures[])
    {
        for(int i = 0; i < newfeatures.length; i++)
            features.addElement(newfeatures[i]);

        return features;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static Vector add(Vector features, Feature newfeature)
    {
        features.addElement(newfeature);
        return features;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static Vector add(Vector features, Vector newfeatures)
    {
        for(Enumeration e = newfeatures.elements(); e.hasMoreElements(); features.addElement(e.nextElement()));
        return features;
    }

    @SuppressWarnings("rawtypes")
	public static String[] toString(Vector features)
    {
        String sa[] = new String[features.size()];
        int i = 0;
        for(Enumeration e = features.elements(); e.hasMoreElements();)
            sa[i++] = (String)e.nextElement();

        return sa;
    }

    public float vector[];
    public String name;
    static final long serialVersionUID = 0;
}

