package paint;

import java.awt.*;

public class MyTrapezius {
    private Polygon pol;
    private Color lineColor;
    private Color color=null;
    public MyTrapezius(){

    }
    public MyTrapezius(Polygon pol){this.pol=pol;}
    public MyTrapezius(Polygon pol, Color lc) {
        this.pol = pol;
        this.lineColor = lc;
    }
    public MyTrapezius(Polygon pol, Color lc, Color c) {
        this.pol = pol;
        this.lineColor = lc;
        this.color = c;
    }

    public void makeObject(Point startDrag, Point endDrag) {
        setLineColor(GUI.selectColor);
        Polygon pol=new Polygon(Math.min(startDrag.x, endDrag.x),Math.min(startDrag.y, endDrag.y));
        Rectangle r = new Rectangle(Math.min(startDrag.x, endDrag.x), Math.min(startDrag.y, endDrag.y), Math.abs(startDrag.x - endDrag.x), Math.abs(startDrag.y - endDrag.y));
        //this.setRect(r);
    }

    public Polygon getPol() {
        return pol;
    }
    public void setPol(Polygon pol) {
        this.pol = pol;
    }
    public Color getLineColor() {
        return lineColor;
    }
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
