/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v2.ui.fly.strains;

abstract class Remove_generated extends star.genetics.v2.ui.common.Button implements star.event.EventController, star.event.Listener, star.genetics.v1.ui.events.OrganismRemoveRaiser
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  Remove_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		super.addNotify();
		getAdapter().addHandled( star.genetics.v1.ui.events.OrganismSelectedEvent.class );
		getAdapter().addHandled( star.genetics.v1.ui.events.ProgenySelectedEvent.class );
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.genetics.v1.ui.events.OrganismSelectedEvent" ) && event.isValid() ) 
		{
			 long start = System.nanoTime();
			
			organismSelected( (star.genetics.v1.ui.events.OrganismSelectedRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".organismSelected "  + ( end-start )/1000000 ); } 
		}
		if( event.getClass().getName().equals( "star.genetics.v1.ui.events.ProgenySelectedEvent" ) && event.isValid() ) 
		{
			 long start = System.nanoTime();
			
			organismSelected( (star.genetics.v1.ui.events.ProgenySelectedRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".organismSelected "  + ( end-start )/1000000 ); } 
		}
	}
	 
	public star.event.Adapter getAdapter()
	{
		if( adapter == null )
		{
			adapter = new star.event.Adapter(this);
		}
		return adapter;
	}
	 
	abstract void organismSelected(star.genetics.v1.ui.events.OrganismSelectedRaiser OrganismSelectedRaiser);
	 
	abstract void organismSelected(star.genetics.v1.ui.events.ProgenySelectedRaiser ProgenySelectedRaiser);
	 
	public void raise_OrganismRemoveEvent()
	{
		(new star.genetics.v1.ui.events.OrganismRemoveEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		super.removeNotify();
		getAdapter().removeHandled( star.genetics.v1.ui.events.OrganismSelectedEvent.class );
		getAdapter().removeHandled( star.genetics.v1.ui.events.ProgenySelectedEvent.class );
	}
	 
}