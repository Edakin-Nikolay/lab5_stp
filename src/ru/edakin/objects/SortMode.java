//06.11.2013 01:17:09
package ru.edakin.objects;

import java.util.Comparator;
import ru.edakin.objects.Body;

public class SortMode implements Comparator<Body>{
    private boolean sortUp;
    private int sortMode;

    public SortMode(boolean sortUp, int sortMode) {
        this.sortUp = sortUp;
        this.sortMode = sortMode;
}

    @Override
    public int compare(Body b1, Body b2) {
    int res=0;
    if (sortMode==0){
        if (b1.getId()>b2.getId()) res=1;
            else if (b1.getId()<b2.getId()) res=-1;
    }
    else if (sortMode==1){
        res=b1.getName().compareTo(b2.getName());
    }
    else if (sortMode==2) {
        if (b1.getVolume()>b2.getVolume()) res=1;
            else if (b1.getVolume()<b2.getVolume()) res=-1;
    }
    else if (sortMode==3) {
        if (b1.getSquare()>b2.getSquare()) res=1;
            else if (b1.getSquare()<b2.getSquare()) res=-1;
    }
    if (sortUp) res*=(-1);
    
    return res;
    }
}
