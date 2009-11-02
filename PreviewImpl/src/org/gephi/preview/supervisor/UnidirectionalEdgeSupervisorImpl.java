package org.gephi.preview.supervisor;

import java.awt.Font;
import org.gephi.preview.color.colormode.EdgeB1ColorMode;
import org.gephi.preview.color.colormode.ParentColorMode;

/**
 * Unidirectional edge supervisor implementation.
 *
 * @author Jérémy Subtil <jeremy.subtil@gephi.org>
 */
public class UnidirectionalEdgeSupervisorImpl extends EdgeSupervisorImpl {

    /**
     * Constructor.
     *
     * Initializes default values.
     */
    public UnidirectionalEdgeSupervisorImpl() {
        curvedFlag = false;
        colorizer = new EdgeB1ColorMode();
        showLabelsFlag = true;
        labelMaxChar = 10;
        labelFont = new Font(Font.SANS_SERIF, Font.PLAIN, 10);
        labelColorizer = new ParentColorMode();
        showMiniLabelsFlag = true;
        miniLabelMaxChar = 10;
        miniLabelFont = new Font(Font.SANS_SERIF, Font.PLAIN, 8);
        miniLabelAddedRadius = 15f;
        miniLabelColorizer = new ParentColorMode();
        showArrowsFlag = true;
        arrowAddedRadius = 65f;
        arrowSize = 20f;
        arrowColorizer = new ParentColorMode();
    }
}