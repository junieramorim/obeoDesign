/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.Team#getMembers <em>Members</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Team#getOperates <em>Operates</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends Entity {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link br.unb.cic.c2system.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see br.unb.cic.c2system.C2systemPackage#getTeam_Members()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entity> getMembers();

	/**
	 * Returns the value of the '<em><b>Operates</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link br.unb.cic.c2system.C2Approach#getApplies <em>Applies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operates</em>' reference.
	 * @see #setOperates(C2Approach)
	 * @see br.unb.cic.c2system.C2systemPackage#getTeam_Operates()
	 * @see br.unb.cic.c2system.C2Approach#getApplies
	 * @model opposite="applies" required="true"
	 * @generated
	 */
	C2Approach getOperates();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Team#getOperates <em>Operates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operates</em>' reference.
	 * @see #getOperates()
	 * @generated
	 */
	void setOperates(C2Approach value);

} // Team
