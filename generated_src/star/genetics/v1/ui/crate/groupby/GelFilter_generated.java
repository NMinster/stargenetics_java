/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v1.ui.crate.groupby;

abstract class GelFilter_generated extends javax.swing.JPanel implements star.event.EventController
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public GelFilter_generated()
	{
		super();
	}

	public GelFilter_generated(boolean boolean0)
	{
		super(boolean0);
	}

	public GelFilter_generated(java.awt.LayoutManager layoutManager, boolean boolean0)
	{
		super(layoutManager, boolean0);
	}

	public GelFilter_generated(java.awt.LayoutManager layoutManager)
	{
		super(layoutManager);
	}

	public void addNotify()
	{
		super.addNotify();
	}

	public star.event.Adapter getAdapter()
	{
		if (adapter == null)
		{
			adapter = new star.event.Adapter(this);
		}
		return adapter;
	}

	public void removeNotify()
	{
		super.removeNotify();
	}

	abstract void update();

	void update_SwingUtilitiesInvokeLater()
	{
		javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable()
		{
			public void run()
			{
				update();
			}
		});
	}

}