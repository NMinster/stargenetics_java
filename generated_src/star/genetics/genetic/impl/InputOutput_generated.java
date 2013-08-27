/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.genetic.impl;

abstract class InputOutput_generated extends java.lang.Object implements star.event.EventController, star.event.Listener, star.genetics.events.ErrorDialogRaiser, star.genetics.events.LoadModelRaiser
{
	private star.event.Adapter adapter;
	private java.lang.Exception errorMessage;
	private star.genetics.genetic.model.Model model;
	private java.lang.String modelName;
	private static final long serialVersionUID = 1L;

	public InputOutput_generated()
	{
		super();
	}

	public void addNotify()
	{
		getAdapter().addHandled(star.genetics.events.ExportModelEvent.class);
		getAdapter().addHandled(star.genetics.events.OpenModelEvent.class);
		getAdapter().addHandled(star.genetics.events.SaveModelEvent.class);
		getAdapter().addHandled(star.genetics.events.LoadModelEvent.class);
	}

	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}

	private void eventRaisedHandles(final star.event.Event event)
	{
		if (event.getClass().getName().equals("star.genetics.events.ExportModelEvent") && event.isValid())
		{
			long start = System.nanoTime();

			export((star.genetics.events.ExportModelRaiser) event.getSource());
			long end = System.nanoTime();
			if (end - start > 500000000)
			{
				System.out.println(this.getClass().getName() + ".export " + (end - start) / 1000000);
			}
		}
		if (event.getClass().getName().equals("star.genetics.events.OpenModelEvent") && event.isValid())
		{
			long start = System.nanoTime();
			(new star.genetics.events.LoadModelEvent(this, false)).raise();
			load((star.genetics.events.OpenModelRaiser) event.getSource());
			long end = System.nanoTime();
			if (end - start > 500000000)
			{
				System.out.println(this.getClass().getName() + ".load " + (end - start) / 1000000);
			}
		}
		if (event.getClass().getName().equals("star.genetics.events.SaveModelEvent") && event.isValid())
		{
			long start = System.nanoTime();

			save((star.genetics.events.SaveModelRaiser) event.getSource());
			long end = System.nanoTime();
			if (end - start > 500000000)
			{
				System.out.println(this.getClass().getName() + ".save " + (end - start) / 1000000);
			}
		}
		if (event.getClass().getName().equals("star.genetics.events.LoadModelEvent") && event.isValid())
		{
			long start = System.nanoTime();

			setModel((star.genetics.events.LoadModelRaiser) event.getSource());
			long end = System.nanoTime();
			if (end - start > 500000000)
			{
				System.out.println(this.getClass().getName() + ".setModel " + (end - start) / 1000000);
			}
		}
	}

	abstract void export(star.genetics.events.ExportModelRaiser ExportModelRaiser);

	public star.event.Adapter getAdapter()
	{
		if (adapter == null)
		{
			adapter = new star.event.Adapter(this);
		}
		return adapter;
	}

	public java.lang.Exception getErrorMessage()
	{
		return this.errorMessage;
	}

	public star.genetics.genetic.model.Model getModel()
	{
		return this.model;
	}

	public java.lang.String getModelName()
	{
		return this.modelName;
	}

	abstract void load(star.genetics.events.OpenModelRaiser OpenModelRaiser);

	public void raise_ErrorDialogEvent()
	{
		(new star.genetics.events.ErrorDialogEvent(this)).raise();
	}

	public void raise_LoadModelEvent()
	{
		(new star.genetics.events.LoadModelEvent(this)).raise();
	}

	public void removeNotify()
	{
		getAdapter().removeHandled(star.genetics.events.ExportModelEvent.class);
		getAdapter().removeHandled(star.genetics.events.OpenModelEvent.class);
		getAdapter().removeHandled(star.genetics.events.SaveModelEvent.class);
		getAdapter().removeHandled(star.genetics.events.LoadModelEvent.class);
	}

	abstract void save(star.genetics.events.SaveModelRaiser SaveModelRaiser);

	protected void setErrorMessage(java.lang.Exception errorMessage)
	{
		this.errorMessage = errorMessage;
	}

	abstract void setModel(star.genetics.events.LoadModelRaiser LoadModelRaiser);

	protected void setModel(star.genetics.genetic.model.Model model)
	{
		this.model = model;
	}

	protected void setModelName(java.lang.String modelName)
	{
		this.modelName = modelName;
	}

}