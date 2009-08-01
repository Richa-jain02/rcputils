package de.ralfebert.rcputils.properties;

/**
 * An IValueFormatter describes a conversion for a value in both directions.
 * Formatters are used for display and editing, that's why both directions are
 * there. If you implement a formatter that's only for display, let the parse
 * method throw an {@link UnsupportedOperationException}.
 * 
 * @author Ralf Ebert <info@ralfebert.de>
 */
public interface IValueFormatter<FROM, TO> {

	public TO format(FROM obj);

	public FROM parse(TO obj);

}
