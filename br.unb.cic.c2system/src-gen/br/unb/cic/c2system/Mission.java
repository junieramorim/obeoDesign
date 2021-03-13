/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.Mission#getCompleteness <em>Completeness</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Mission#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends Allocable {
	/**
	 * Returns the value of the '<em><b>Completeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completeness</em>' attribute.
	 * @see #setCompleteness(double)
	 * @see br.unb.cic.c2system.C2systemPackage#getMission_Completeness()
	 * @model
	 * @generated
	 */
	double getCompleteness();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Mission#getCompleteness <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completeness</em>' attribute.
	 * @see #getCompleteness()
	 * @generated
	 */
	void setCompleteness(double value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link br.unb.cic.c2system.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see br.unb.cic.c2system.C2systemPackage#getMission_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Mission
