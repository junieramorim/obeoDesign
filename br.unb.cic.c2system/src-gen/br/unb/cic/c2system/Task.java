/**
 */
package br.unb.cic.c2system;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.Task#isCompleted <em>Completed</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Task#getCost <em>Cost</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Task#getXPos <em>XPos</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Task#getYPos <em>YPos</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Allocable {
	/**
	 * Returns the value of the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed</em>' attribute.
	 * @see #setCompleted(boolean)
	 * @see br.unb.cic.c2system.C2systemPackage#getTask_Completed()
	 * @model required="true"
	 * @generated
	 */
	boolean isCompleted();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Task#isCompleted <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed</em>' attribute.
	 * @see #isCompleted()
	 * @generated
	 */
	void setCompleted(boolean value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see br.unb.cic.c2system.C2systemPackage#getTask_Cost()
	 * @model required="true"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Task#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPos</em>' attribute.
	 * @see #setXPos(double)
	 * @see br.unb.cic.c2system.C2systemPackage#getTask_XPos()
	 * @model
	 * @generated
	 */
	double getXPos();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Task#getXPos <em>XPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPos</em>' attribute.
	 * @see #getXPos()
	 * @generated
	 */
	void setXPos(double value);

	/**
	 * Returns the value of the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPos</em>' attribute.
	 * @see #setYPos(double)
	 * @see br.unb.cic.c2system.C2systemPackage#getTask_YPos()
	 * @model
	 * @generated
	 */
	double getYPos();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Task#getYPos <em>YPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPos</em>' attribute.
	 * @see #getYPos()
	 * @generated
	 */
	void setYPos(double value);

} // Task
