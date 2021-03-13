/**
 */
package br.unb.cic.c2system.impl;

import br.unb.cic.c2system.C2systemPackage;
import br.unb.cic.c2system.Mission;
import br.unb.cic.c2system.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.impl.MissionImpl#getCompleteness <em>Completeness</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.MissionImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends AllocableImpl implements Mission {
	/**
	 * The default value of the '{@link #getCompleteness() <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteness()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPLETENESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompleteness() <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteness()
	 * @generated
	 * @ordered
	 */
	protected double completeness = COMPLETENESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C2systemPackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompleteness() {
		return completeness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteness(double newCompleteness) {
		double oldCompleteness = completeness;
		completeness = newCompleteness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2systemPackage.MISSION__COMPLETENESS,
					oldCompleteness, completeness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, C2systemPackage.MISSION__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C2systemPackage.MISSION__TASKS:
			return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case C2systemPackage.MISSION__COMPLETENESS:
			return getCompleteness();
		case C2systemPackage.MISSION__TASKS:
			return getTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case C2systemPackage.MISSION__COMPLETENESS:
			setCompleteness((Double) newValue);
			return;
		case C2systemPackage.MISSION__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends Task>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case C2systemPackage.MISSION__COMPLETENESS:
			setCompleteness(COMPLETENESS_EDEFAULT);
			return;
		case C2systemPackage.MISSION__TASKS:
			getTasks().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case C2systemPackage.MISSION__COMPLETENESS:
			return completeness != COMPLETENESS_EDEFAULT;
		case C2systemPackage.MISSION__TASKS:
			return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (completeness: ");
		result.append(completeness);
		result.append(')');
		return result.toString();
	}

} //MissionImpl
