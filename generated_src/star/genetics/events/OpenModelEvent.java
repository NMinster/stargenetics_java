/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.genetics.events;

public class OpenModelEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public OpenModelEvent(star.event.Raiser raiser, boolean valid)
	{
		super(raiser, valid);
	}

	public OpenModelEvent(star.genetics.events.OpenModelEvent event)
	{
		super(event);
	}

	public OpenModelEvent(star.genetics.events.OpenModelRaiser raiser)
	{
		super(raiser);
	}

}