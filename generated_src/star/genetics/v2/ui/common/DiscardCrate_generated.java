/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v2.ui.common;

abstract class DiscardCrate_generated extends star.genetics.v2.ui.common.Button implements star.event.EventController, star.genetics.v1.ui.events.CrateNewCrateRaiser
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  DiscardCrate_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		super.addNotify();
	}
	 
	public star.event.Adapter getAdapter()
	{
		if( adapter == null )
		{
			adapter = new star.event.Adapter(this);
		}
		return adapter;
	}
	 
	public void raise_CrateNewCrateEvent()
	{
		(new star.genetics.v1.ui.events.CrateNewCrateEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		super.removeNotify();
	}
	 
}