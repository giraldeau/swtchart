package org.swtchart;

import org.eclipse.swt.events.PaintListener;

/**
 * The paint listener to paint on plot area.
 */
public interface ICustomPaintListener extends PaintListener {

    /**
     * Gets the state indicating if painting behind series.
     *
     * @return True if painting behind series
     */
    boolean drawBehindSeries();
}
