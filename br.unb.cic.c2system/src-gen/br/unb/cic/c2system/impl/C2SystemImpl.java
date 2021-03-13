/**
 */
package br.unb.cic.c2system.impl;

import br.unb.cic.c2system.AllocationSet;
import br.unb.cic.c2system.C2Approach;
import br.unb.cic.c2system.C2System;
import br.unb.cic.c2system.C2systemPackage;
import br.unb.cic.c2system.Entity;
import br.unb.cic.c2system.Environment;
import br.unb.cic.c2system.Mission;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>C2 System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.impl.C2SystemImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.C2SystemImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.C2SystemImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.C2SystemImpl#getApproaches <em>Approaches</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.C2SystemImpl#getAllocationSet <em>Allocation Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class C2SystemImpl extends MinimalEObjectImpl.Container implements C2System {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getMissions() <em>Missions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> missions;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getApproaches() <em>Approaches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproaches()
	 * @generated
	 * @ordered
	 */
	protected EList<C2Approach> approaches;

	/**
	 * The cached value of the '{@link #getAllocationSet() <em>Allocation Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationSet()
	 * @generated
	 * @ordered
	 */
	protected AllocationSet allocationSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected C2SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C2systemPackage.Literals.C2_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, C2systemPackage.C2_SYSTEM__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mission> getMissions() {
		if (missions == null) {
			missions = new EObjectContainmentEList<Mission>(Mission.class, this, C2systemPackage.C2_SYSTEM__MISSIONS);
		}
		return missions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					C2systemPackage.C2_SYSTEM__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject) environment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - C2systemPackage.C2_SYSTEM__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject) newEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - C2systemPackage.C2_SYSTEM__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2systemPackage.C2_SYSTEM__ENVIRONMENT,
					newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C2Approach> getApproaches() {
		if (approaches == null) {
			approaches = new EObjectContainmentEList<C2Approach>(C2Approach.class, this,
					C2systemPackage.C2_SYSTEM__APPROACHES);
		}
		return approaches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationSet getAllocationSet() {
		return allocationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationSet(AllocationSet newAllocationSet, NotificationChain msgs) {
		AllocationSet oldAllocationSet = allocationSet;
		allocationSet = newAllocationSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					C2systemPackage.C2_SYSTEM__ALLOCATION_SET, oldAllocationSet, newAllocationSet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationSet(AllocationSet newAllocationSet) {
		if (newAllocationSet != allocationSet) {
			NotificationChain msgs = null;
			if (allocationSet != null)
				msgs = ((InternalEObject) allocationSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - C2systemPackage.C2_SYSTEM__ALLOCATION_SET, null, msgs);
			if (newAllocationSet != null)
				msgs = ((InternalEObject) newAllocationSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - C2systemPackage.C2_SYSTEM__ALLOCATION_SET, null, msgs);
			msgs = basicSetAllocationSet(newAllocationSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2systemPackage.C2_SYSTEM__ALLOCATION_SET,
					newAllocationSet, newAllocationSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C2systemPackage.C2_SYSTEM__ENTITIES:
			return ((InternalEList<?>) getEntities()).basicRemove(otherEnd, msgs);
		case C2systemPackage.C2_SYSTEM__MISSIONS:
			return ((InternalEList<?>) getMissions()).basicRemove(otherEnd, msgs);
		case C2systemPackage.C2_SYSTEM__ENVIRONMENT:
			return basicSetEnvironment(null, msgs);
		case C2systemPackage.C2_SYSTEM__APPROACHES:
			return ((InternalEList<?>) getApproaches()).basicRemove(otherEnd, msgs);
		case C2systemPackage.C2_SYSTEM__ALLOCATION_SET:
			return basicSetAllocationSet(null, msgs);
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
		case C2systemPackage.C2_SYSTEM__ENTITIES:
			return getEntities();
		case C2systemPackage.C2_SYSTEM__MISSIONS:
			return getMissions();
		case C2systemPackage.C2_SYSTEM__ENVIRONMENT:
			return getEnvironment();
		case C2systemPackage.C2_SYSTEM__APPROACHES:
			return getApproaches();
		case C2systemPackage.C2_SYSTEM__ALLOCATION_SET:
			return getAllocationSet();
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
		case C2systemPackage.C2_SYSTEM__ENTITIES:
			getEntities().clear();
			getEntities().addAll((Collection<? extends Entity>) newValue);
			return;
		case C2systemPackage.C2_SYSTEM__MISSIONS:
			getMissions().clear();
			getMissions().addAll((Collection<? extends Mission>) newValue);
			return;
		case C2systemPackage.C2_SYSTEM__ENVIRONMENT:
			setEnvironment((Environment) newValue);
			return;
		case C2systemPackage.C2_SYSTEM__APPROACHES:
			getApproaches().clear();
			getApproaches().addAll((Collection<? extends C2Approach>) newValue);
			return;
		case C2systemPackage.C2_SYSTEM__ALLOCATION_SET:
			setAllocationSet((AllocationSet) newValue);
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
		case C2systemPackage.C2_SYSTEM__ENTITIES:
			getEntities().clear();
			return;
		case C2systemPackage.C2_SYSTEM__MISSIONS:
			getMissions().clear();
			return;
		case C2systemPackage.C2_SYSTEM__ENVIRONMENT:
			setEnvironment((Environment) null);
			return;
		case C2systemPackage.C2_SYSTEM__APPROACHES:
			getApproaches().clear();
			return;
		case C2systemPackage.C2_SYSTEM__ALLOCATION_SET:
			setAllocationSet((AllocationSet) null);
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
		case C2systemPackage.C2_SYSTEM__ENTITIES:
			return entities != null && !entities.isEmpty();
		case C2systemPackage.C2_SYSTEM__MISSIONS:
			return missions != null && !missions.isEmpty();
		case C2systemPackage.C2_SYSTEM__ENVIRONMENT:
			return environment != null;
		case C2systemPackage.C2_SYSTEM__APPROACHES:
			return approaches != null && !approaches.isEmpty();
		case C2systemPackage.C2_SYSTEM__ALLOCATION_SET:
			return allocationSet != null;
		}
		return super.eIsSet(featureID);
	}

} //C2SystemImpl
