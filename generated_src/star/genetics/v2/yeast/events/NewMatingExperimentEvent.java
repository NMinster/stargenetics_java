/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.v2.yeast.events;

public class NewMatingExperimentEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  NewMatingExperimentEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  NewMatingExperimentEvent(star.genetics.v2.yeast.events.NewMatingExperimentEvent event)
	{
		super( event ) ;
	}
	 
	public  NewMatingExperimentEvent(star.genetics.v2.yeast.events.NewMatingExperimentRaiser raiser)
	{
		super( raiser ) ;
	}
	 
}