/**
 */
package br.unb.cic.c2system.impl;

import br.unb.cic.c2system.C2AType;
import br.unb.cic.c2system.C2Approach;
import br.unb.cic.c2system.C2systemPackage;
import br.unb.cic.c2system.Connection;
import br.unb.cic.c2system.Role;
import br.unb.cic.c2system.Team;

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
 * An implementation of the model object '<em><b>C2 Approach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.impl.C2ApproachImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.C2ApproachImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.C2ApproachImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.C2ApproachImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class C2ApproachImpl extends NamedClassImpl implements C2Approach {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final C2AType TYPE_EDEFAULT = C2AType.DECONFLICTED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected C2AType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected Team applies;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected C2ApproachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C2systemPackage.Literals.C2_APPROACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C2AType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(C2AType newType) {
		C2AType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2systemPackage.C2_APPROACH__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, C2systemPackage.C2_APPROACH__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getApplies() {
		if (applies != null && applies.eIsProxy()) {
			InternalEObject oldApplies = (InternalEObject) applies;
			applies = (Team) eResolveProxy(oldApplies);
			if (applies != oldApplies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, C2systemPackage.C2_APPROACH__APPLIES,
							oldApplies, applies));
			}
		}
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetApplies() {
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplies(Team newApplies, NotificationChain msgs) {
		Team oldApplies = applies;
		applies = newApplies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					C2systemPackage.C2_APPROACH__APPLIES, oldApplies, newApplies);
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
	public void setApplies(Team newApplies) {
		if (newApplies != applies) {
			NotificationChain msgs = null;
			if (applies != null)
				msgs = ((InternalEObject) applies).eInverseRemove(this, C2systemPackage.TEAM__OPERATES, Team.class,
						msgs);
			if (newApplies != null)
				msgs = ((InternalEObject) newApplies).eInverseAdd(this, C2systemPackage.TEAM__OPERATES, Team.class,
						msgs);
			msgs = basicSetApplies(newApplies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2systemPackage.C2_APPROACH__APPLIES, newApplies,
					newApplies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this,
					C2systemPackage.C2_APPROACH__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C2systemPackage.C2_APPROACH__APPLIES:
			if (applies != null)
				msgs = ((InternalEObject) applies).eInverseRemove(this, C2systemPackage.TEAM__OPERATES, Team.class,
						msgs);
			return basicSetApplies((Team) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C2systemPackage.C2_APPROACH__ROLES:
			return ((InternalEList<?>) getRoles()).basicRemove(otherEnd, msgs);
		case C2systemPackage.C2_APPROACH__APPLIES:
			return basicSetApplies(null, msgs);
		case C2systemPackage.C2_APPROACH__CONNECTIONS:
			return ((InternalEList<?>) getConnections()).basicRemove(otherEnd, msgs);
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
		case C2systemPackage.C2_APPROACH__TYPE:
			return getType();
		case C2systemPackage.C2_APPROACH__ROLES:
			return getRoles();
		case C2systemPackage.C2_APPROACH__APPLIES:
			if (resolve)
				return getApplies();
			return basicGetApplies();
		case C2systemPackage.C2_APPROACH__CONNECTIONS:
			return getConnections();
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
		case C2systemPackage.C2_APPROACH__TYPE:
			setType((C2AType) newValue);
			return;
		case C2systemPackage.C2_APPROACH__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case C2systemPackage.C2_APPROACH__APPLIES:
			setApplies((Team) newValue);
			return;
		case C2systemPackage.C2_APPROACH__CONNECTIONS:
			getConnections().clear();
			getConnections().addAll((Collection<? extends Connection>) newValue);
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
		case C2systemPackage.C2_APPROACH__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case C2systemPackage.C2_APPROACH__ROLES:
			getRoles().clear();
			return;
		case C2systemPackage.C2_APPROACH__APPLIES:
			setApplies((Team) null);
			return;
		case C2systemPackage.C2_APPROACH__CONNECTIONS:
			getConnections().clear();
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
		case C2systemPackage.C2_APPROACH__TYPE:
			return type != TYPE_EDEFAULT;
		case C2systemPackage.C2_APPROACH__ROLES:
			return roles != null && !roles.isEmpty();
		case C2systemPackage.C2_APPROACH__APPLIES:
			return applies != null;
		case C2systemPackage.C2_APPROACH__CONNECTIONS:
			return connections != null && !connections.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //C2ApproachImpl
