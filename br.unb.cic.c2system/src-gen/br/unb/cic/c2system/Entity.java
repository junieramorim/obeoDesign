/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.Entity#getRoleassignment <em>Roleassignment</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Entity#isPoc <em>Poc</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Entity#isLeader <em>Leader</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends NamedClass {
	/**
	 * Returns the value of the '<em><b>Roleassignment</b></em>' reference list.
	 * The list contents are of type {@link br.unb.cic.c2system.Role}.
	 * It is bidirectional and its opposite is '{@link br.unb.cic.c2system.Role#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roleassignment</em>' reference list.
	 * @see br.unb.cic.c2system.C2systemPackage#getEntity_Roleassignment()
	 * @see br.unb.cic.c2system.Role#getEntity
	 * @model opposite="entity" keys="type" required="true" upper="3"
	 * @generated
	 */
	EList<Role> getRoleassignment();

	/**
	 * Returns the value of the '<em><b>Poc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poc</em>' attribute.
	 * @see #setPoc(boolean)
	 * @see br.unb.cic.c2system.C2systemPackage#getEntity_Poc()
	 * @model
	 * @generated
	 */
	boolean isPoc();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Entity#isPoc <em>Poc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poc</em>' attribute.
	 * @see #isPoc()
	 * @generated
	 */
	void setPoc(boolean value);

	/**
	 * Returns the value of the '<em><b>Leader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader</em>' attribute.
	 * @see #setLeader(boolean)
	 * @see br.unb.cic.c2system.C2systemPackage#getEntity_Leader()
	 * @model
	 * @generated
	 */
	boolean isLeader();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Entity#isLeader <em>Leader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader</em>' attribute.
	 * @see #isLeader()
	 * @generated
	 */
	void setLeader(boolean value);

} // Entity
