/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v1.ui.crate;

abstract class CratePanel_generated extends javax.swing.JPanel implements star.event.EventController, star.event.Listener
{
	private star.event.Adapter adapter;
	private javax.swing.JTabbedPane cratePanel;
	private star.genetics.genetic.model.Model model;
	private static final long serialVersionUID = 1L;

	public CratePanel_generated()
	{
		super();
	}

	public CratePanel_generated(boolean boolean0)
	{
		super(boolean0);
	}

	public CratePanel_generated(java.awt.LayoutManager layoutManager, boolean boolean0)
	{
		super(layoutManager, boolean0);
	}

	public CratePanel_generated(java.awt.LayoutManager layoutManager)
	{
		super(layoutManager);
	}

	public void addNotify()
	{
		super.addNotify();
		getAdapter().addHandled(star.genetics.v1.ui.events.CrateNewCrateEvent.class);
	}

	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}

	private void eventRaisedHandles(final star.event.Event event)
	{
		if (event.getClass().getName().equals("star.genetics.v1.ui.events.CrateNewCrateEvent") && event.isValid())
		{
			long start = System.nanoTime();

			newCrate((star.genetics.v1.ui.events.CrateNewCrateRaiser) event.getSource());
			long end = System.nanoTime();
			if (end - start > 500000000)
			{
				System.out.println(this.getClass().getName() + ".newCrate " + (end - start) / 1000000);
			}
		}
	}

	public star.event.Adapter getAdapter()
	{
		if (adapter == null)
		{
			adapter = new star.event.Adapter(this);
		}
		return adapter;
	}

	protected javax.swing.JTabbedPane getCratePanel()
	{
		return this.cratePanel;
	}

	protected star.genetics.genetic.model.Model getModel()
	{
		return this.model;
	}

	abstract void newCrate(star.genetics.v1.ui.events.CrateNewCrateRaiser CrateNewCrateRaiser);

	public void removeNotify()
	{
		super.removeNotify();
		getAdapter().removeHandled(star.genetics.v1.ui.events.CrateNewCrateEvent.class);
	}

	protected void setCratePanel(javax.swing.JTabbedPane cratePanel)
	{
		this.cratePanel = cratePanel;
	}

	protected void setModel(star.genetics.genetic.model.Model model)
	{
		this.model = model;
	}

}