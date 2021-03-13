/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>C2 System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.C2System#getEntities <em>Entities</em>}</li>
 *   <li>{@link br.unb.cic.c2system.C2System#getMissions <em>Missions</em>}</li>
 *   <li>{@link br.unb.cic.c2system.C2System#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link br.unb.cic.c2system.C2System#getApproaches <em>Approaches</em>}</li>
 *   <li>{@link br.unb.cic.c2system.C2System#getAllocationSet <em>Allocation Set</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getC2System()
 * @model
 * @generated
 */
public interface C2System extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link br.unb.cic.c2system.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see br.unb.cic.c2system.C2systemPackage#getC2System_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Missions</b></em>' containment reference list.
	 * The list contents are of type {@link br.unb.cic.c2system.Mission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missions</em>' containment reference list.
	 * @see br.unb.cic.c2system.C2systemPackage#getC2System_Missions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Mission> getMissions();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see br.unb.cic.c2system.C2systemPackage#getC2System_Environment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.C2System#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Approaches</b></em>' containment reference list.
	 * The list contents are of type {@link br.unb.cic.c2system.C2Approach}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approaches</em>' containment reference list.
	 * @see br.unb.cic.c2system.C2systemPackage#getC2System_Approaches()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<C2Approach> getApproaches();

	/**
	 * Returns the value of the '<em><b>Allocation Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Set</em>' containment reference.
	 * @see #setAllocationSet(AllocationSet)
	 * @see br.unb.cic.c2system.C2systemPackage#getC2System_AllocationSet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AllocationSet getAllocationSet();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.C2System#getAllocationSet <em>Allocation Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Set</em>' containment reference.
	 * @see #getAllocationSet()
	 * @generated
	 */
	void setAllocationSet(AllocationSet value);

} // C2System
