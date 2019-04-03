/**
 */
package Clueless.impl;

import Clueless.Hallway;
import Clueless.MainPackage;
import Clueless.Player;
import Clueless.Room;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Clueless.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link Clueless.impl.RoomImpl#getTrapDoorRoom <em>Trap Door Room</em>}</li>
 *   <li>{@link Clueless.impl.RoomImpl#getPlayerList <em>Player List</em>}</li>
 *   <li>{@link Clueless.impl.RoomImpl#getHallwayList <em>Hallway List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrapDoorRoom() <em>Trap Door Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrapDoorRoom()
	 * @generated
	 * @ordered
	 */
	protected Room trapDoorRoom;

	/**
	 * The cached value of the '{@link #getPlayerList() <em>Player List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerList()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> playerList;

	/**
	 * The cached value of the '{@link #getHallwayList() <em>Hallway List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHallwayList()
	 * @generated
	 * @ordered
	 */
	protected EList<Hallway> hallwayList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MainPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.ROOM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getTrapDoorRoom() {
		if (trapDoorRoom != null && trapDoorRoom.eIsProxy()) {
			InternalEObject oldTrapDoorRoom = (InternalEObject)trapDoorRoom;
			trapDoorRoom = (Room)eResolveProxy(oldTrapDoorRoom);
			if (trapDoorRoom != oldTrapDoorRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.ROOM__TRAP_DOOR_ROOM, oldTrapDoorRoom, trapDoorRoom));
			}
		}
		return trapDoorRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetTrapDoorRoom() {
		return trapDoorRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrapDoorRoom(Room newTrapDoorRoom) {
		Room oldTrapDoorRoom = trapDoorRoom;
		trapDoorRoom = newTrapDoorRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.ROOM__TRAP_DOOR_ROOM, oldTrapDoorRoom, trapDoorRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayerList() {
		if (playerList == null) {
			playerList = new EObjectResolvingEList<Player>(Player.class, this, MainPackage.ROOM__PLAYER_LIST);
		}
		return playerList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hallway> getHallwayList() {
		if (hallwayList == null) {
			hallwayList = new EObjectResolvingEList<Hallway>(Hallway.class, this, MainPackage.ROOM__HALLWAY_LIST);
		}
		return hallwayList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MainPackage.ROOM__NAME:
				return getName();
			case MainPackage.ROOM__TRAP_DOOR_ROOM:
				if (resolve) return getTrapDoorRoom();
				return basicGetTrapDoorRoom();
			case MainPackage.ROOM__PLAYER_LIST:
				return getPlayerList();
			case MainPackage.ROOM__HALLWAY_LIST:
				return getHallwayList();
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
			case MainPackage.ROOM__NAME:
				setName((String)newValue);
				return;
			case MainPackage.ROOM__TRAP_DOOR_ROOM:
				setTrapDoorRoom((Room)newValue);
				return;
			case MainPackage.ROOM__PLAYER_LIST:
				getPlayerList().clear();
				getPlayerList().addAll((Collection<? extends Player>)newValue);
				return;
			case MainPackage.ROOM__HALLWAY_LIST:
				getHallwayList().clear();
				getHallwayList().addAll((Collection<? extends Hallway>)newValue);
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
			case MainPackage.ROOM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MainPackage.ROOM__TRAP_DOOR_ROOM:
				setTrapDoorRoom((Room)null);
				return;
			case MainPackage.ROOM__PLAYER_LIST:
				getPlayerList().clear();
				return;
			case MainPackage.ROOM__HALLWAY_LIST:
				getHallwayList().clear();
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
			case MainPackage.ROOM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MainPackage.ROOM__TRAP_DOOR_ROOM:
				return trapDoorRoom != null;
			case MainPackage.ROOM__PLAYER_LIST:
				return playerList != null && !playerList.isEmpty();
			case MainPackage.ROOM__HALLWAY_LIST:
				return hallwayList != null && !hallwayList.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
