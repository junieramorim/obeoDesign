/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>C2 Approach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.C2Approach#getType <em>Type</em>}</li>
 *   <li>{@link br.unb.cic.c2system.C2Approach#getRoles <em>Roles</em>}</li>
 *   <li>{@link br.unb.cic.c2system.C2Approach#getApplies <em>Applies</em>}</li>
 *   <li>{@link br.unb.cic.c2system.C2Approach#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getC2Approach()
 * @model
 * @generated
 */
public interface C2Approach extends NamedClass {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"DECONFLICTED"</code>.
	 * The literals are from the enumeration {@link br.unb.cic.c2system.C2AType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.unb.cic.c2system.C2AType
	 * @see #setType(C2AType)
	 * @see br.unb.cic.c2system.C2systemPackage#getC2Approach_Type()
	 * @model default="DECONFLICTED"
	 * @generated
	 */
	C2AType getType();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.C2Approach#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.unb.cic.c2system.C2AType
	 * @see #getType()
	 * @generated
	 */
	void setType(C2AType value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link br.unb.cic.c2system.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see br.unb.cic.c2system.C2systemPackage#getC2Approach_Roles()
	 * @model containment="true" keys="type" lower="3" upper="3"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link br.unb.cic.c2system.Team#getOperates <em>Operates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies</em>' reference.
	 * @see #setApplies(Team)
	 * @see br.unb.cic.c2system.C2systemPackage#getC2Approach_Applies()
	 * @see br.unb.cic.c2system.Team#getOperates
	 * @model opposite="operates" required="true"
	 * @generated
	 */
	Team getApplies();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.C2Approach#getApplies <em>Applies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies</em>' reference.
	 * @see #getApplies()
	 * @generated
	 */
	void setApplies(Team value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link br.unb.cic.c2system.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see br.unb.cic.c2system.C2systemPackage#getC2Approach_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // C2Approach
