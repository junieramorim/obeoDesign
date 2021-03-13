/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.Role#getType <em>Type</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Role#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedClass {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.unb.cic.c2system.RoleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.unb.cic.c2system.RoleType
	 * @see #setType(RoleType)
	 * @see br.unb.cic.c2system.C2systemPackage#getRole_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoleType getType();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Role#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.unb.cic.c2system.RoleType
	 * @see #getType()
	 * @generated
	 */
	void setType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference list.
	 * The list contents are of type {@link br.unb.cic.c2system.Entity}.
	 * It is bidirectional and its opposite is '{@link br.unb.cic.c2system.Entity#getRoleassignment <em>Roleassignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference list.
	 * @see br.unb.cic.c2system.C2systemPackage#getRole_Entity()
	 * @see br.unb.cic.c2system.Entity#getRoleassignment
	 * @model opposite="roleassignment"
	 * @generated
	 */
	EList<Entity> getEntity();

} // Role
