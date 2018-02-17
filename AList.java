package edu.gcccd.csis;

// Do NOT import classes from the java.util package.
// Do NOT use the java.lang.System class

// Come up with your own implementation.
// Please consider using an array ...

public class AList {

    public Object[] master;
    private String returnable;

    public AList(Object[] oa) {
        this.master = oa;
    }

    public int size() {
        return master.length;
    }

    public Object add(Object obj) {

        Object[] list1 = new Object[master.length + 1];//initialize 1 entry larger array

        int i = 0;
        for (Object x : master) {
            list1[i++] = x;
        }

        list1[master.length] = obj;
        master = list1;
        return obj;
    }

    public Object remove2(Object obj) {
        boolean found = false;
        for (Object x : master) {
            if (x.equals(obj)) {
                found = true;
                break;
            }
        }
        if (!found) {
            return null;
        }
        Object[] list1 = new Object[master.length - 1];
        int i = 0;
        for (Object x : master)
        {
            if(!x.equals(obj))
            {
                list1[i++] = x;
            }
        }
        master= list1;
        return obj;
    }

    public Object remove(Object obj) {

        Object[] list1 = new Object[master.length - 1];
        boolean found = false;
        int i = 0;
        for (Object x : master) {
            if (x.equals(obj)) {
                found = true;
            } else if (i < list1.length) {
                list1[i++] = x;
            }
        }
        if (found) {
            master = list1;
        }
        return found ? obj : null;
    }


    public String toString2() {

        String[] CityNames = new String[master.length];

        for (int i = 0; i < master.length; i++) {
            CityNames[i] = master[i].toString();

            if (i > 0)
                returnable = returnable + ", " + CityNames[i];
            else
                returnable = CityNames[i];
        }
        return returnable;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < master.length; i++) {
            s += master[i];
            if (i < master.length - 1) {
                s += ", ";
            }
        }
        return s;

    }
    public String getLongest ()
    {
        Object tbr = master[0];

        for (int i=1; i < master.length; i++)
        {
            if(master[i].toString().length() > tbr.toString().length())
            {
                tbr = master[i];
            }
        }
        return tbr.toString();
    }
    public void reverse ()
    {
        String[] tmp = new String[master.length];
        int k = master.length - 1;

        for (int i = 0; i < master.length; i++) {
            String stringtmp = master[k].toString();
            tmp[i] = stringtmp;
            k--;
        }
        master = tmp;
    }
}

