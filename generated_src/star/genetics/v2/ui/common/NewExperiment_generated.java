/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v2.ui.common;

abstract class NewExperiment_generated extends star.genetics.v2.ui.common.Button implements star.event.EventController, star.event.Listener, star.genetics.v1.ui.events.CrateNewCrateRaiser
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public NewExperiment_generated()
	{
		super();
	}

	public void addNotify()
	{
		super.addNotify();
		getAdapter().addHandled(star.genetics.v2.yeast.events.StorableExperimentEvent.class);
	}

	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}

	private void eventRaisedHandles(final star.event.Event event)
	{
		if (event.getClass().getName().equals("star.genetics.v2.yeast.events.StorableExperimentEvent") && event.isValid())
		{
			long start = System.nanoTime();

			handle((star.genetics.v2.yeast.events.StorableExperimentRaiser) event.getSource());
			long end = System.nanoTime();
			if (end - start > 500000000)
			{
				System.out.println(this.getClass().getName() + ".handle " + (end - start) / 1000000);
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

	abstract void handle(star.genetics.v2.yeast.events.StorableExperimentRaiser StorableExperimentRaiser);

	public void raise_CrateNewCrateEvent()
	{
		(new star.genetics.v1.ui.events.CrateNewCrateEvent(this)).raise();
	}

	public void removeNotify()
	{
		super.removeNotify();
		getAdapter().removeHandled(star.genetics.v2.yeast.events.StorableExperimentEvent.class);
	}

}