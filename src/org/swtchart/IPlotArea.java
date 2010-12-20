package org.swtchart;

/**
 * The plot area.
 */
public interface IPlotArea {

    /**
     * Adds the custom paint listener.
     *
     * @param listener
     *            the custom paint listener
     */
    public void addCustomPaintListener(ICustomPaintListener listener);

    /**
     * Removes the custom paint listener
     *
     * @param listener
     *            the custom paint listener
     */
    public void removeCustomPaintListener(ICustomPaintListener listener);
}
