/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v1.ui.events;

public class OrganismSetAsParentEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  OrganismSetAsParentEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  OrganismSetAsParentEvent(star.genetics.v1.ui.events.OrganismSetAsParentEvent event)
	{
		super( event ) ;
	}
	 
	public  OrganismSetAsParentEvent(star.genetics.v1.ui.events.OrganismSetAsParentRaiser raiser)
	{
		super( raiser ) ;
	}
	 
}