/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Waypoint;
/**
 *
 * @author Duc Pham Ngoc
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.GeoPosition;

public class RoutePainter implements Painter<JXMapViewer> {

    private final List<GeoPosition> track;

    public RoutePainter(List<GeoPosition> track){
        this.track = new ArrayList<>(track);
    }

    @Override
    public void paint(Graphics2D g,JXMapViewer map,int w,int h) {
        g = (Graphics2D) g.create();
        g.setColor(Color.RED);
        g.setStroke(new BasicStroke(3));

        Rectangle viewportBounds = map.getViewportBounds();

        Point2D prevPoint = null;
        for (GeoPosition gp:track){
            Point2D pt = map.getTileFactory().geoToPixel(gp,map.getZoom());
            int x = (int) (pt.getX() - viewportBounds.getX());
            int y = (int) (pt.getY() - viewportBounds.getY());
            if (prevPoint != null){
                g.drawLine((int)prevPoint.getX(),(int)prevPoint.getY(),x,y);
            }
            prevPoint = new Point(x,y);
        }
        g.dispose();
    }
}

