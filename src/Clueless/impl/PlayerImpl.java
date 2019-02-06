/**
 */
package Clueless.impl;

import Clueless.Card;
import Clueless.MainPackage;
import Clueless.Player;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Clueless.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link Clueless.impl.PlayerImpl#getColor <em>Color</em>}</li>
 *   <li>{@link Clueless.impl.PlayerImpl#getTurnToken <em>Turn Token</em>}</li>
 *   <li>{@link Clueless.impl.PlayerImpl#getPersonId <em>Person Id</em>}</li>
 *   <li>{@link Clueless.impl.PlayerImpl#getCardList <em>Card List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTurnToken() <em>Turn Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnToken()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TURN_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTurnToken() <em>Turn Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnToken()
	 * @generated
	 * @ordered
	 */
	protected Boolean turnToken = TURN_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersonId() <em>Person Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonId() <em>Person Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonId()
	 * @generated
	 * @ordered
	 */
	protected String personId = PERSON_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCardList() <em>Card List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardList()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> cardList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MainPackage.Literals.PLAYER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.PLAYER__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTurnToken() {
		return turnToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTurnToken(Boolean newTurnToken) {
		Boolean oldTurnToken = turnToken;
		turnToken = newTurnToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.PLAYER__TURN_TOKEN, oldTurnToken, turnToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonId() {
		return personId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonId(String newPersonId) {
		String oldPersonId = personId;
		personId = newPersonId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.PLAYER__PERSON_ID, oldPersonId, personId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Card> getCardList() {
		if (cardList == null) {
			cardList = new EObjectResolvingEList<Card>(Card.class, this, MainPackage.PLAYER__CARD_LIST);
		}
		return cardList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void move() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accuse() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void suggest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MainPackage.PLAYER__NAME:
				return getName();
			case MainPackage.PLAYER__COLOR:
				return getColor();
			case MainPackage.PLAYER__TURN_TOKEN:
				return getTurnToken();
			case MainPackage.PLAYER__PERSON_ID:
				return getPersonId();
			case MainPackage.PLAYER__CARD_LIST:
				return getCardList();
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
			case MainPackage.PLAYER__NAME:
				setName((String)newValue);
				return;
			case MainPackage.PLAYER__COLOR:
				setColor((String)newValue);
				return;
			case MainPackage.PLAYER__TURN_TOKEN:
				setTurnToken((Boolean)newValue);
				return;
			case MainPackage.PLAYER__PERSON_ID:
				setPersonId((String)newValue);
				return;
			case MainPackage.PLAYER__CARD_LIST:
				getCardList().clear();
				getCardList().addAll((Collection<? extends Card>)newValue);
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
			case MainPackage.PLAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MainPackage.PLAYER__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case MainPackage.PLAYER__TURN_TOKEN:
				setTurnToken(TURN_TOKEN_EDEFAULT);
				return;
			case MainPackage.PLAYER__PERSON_ID:
				setPersonId(PERSON_ID_EDEFAULT);
				return;
			case MainPackage.PLAYER__CARD_LIST:
				getCardList().clear();
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
			case MainPackage.PLAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MainPackage.PLAYER__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case MainPackage.PLAYER__TURN_TOKEN:
				return TURN_TOKEN_EDEFAULT == null ? turnToken != null : !TURN_TOKEN_EDEFAULT.equals(turnToken);
			case MainPackage.PLAYER__PERSON_ID:
				return PERSON_ID_EDEFAULT == null ? personId != null : !PERSON_ID_EDEFAULT.equals(personId);
			case MainPackage.PLAYER__CARD_LIST:
				return cardList != null && !cardList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MainPackage.PLAYER___MOVE:
				move();
				return null;
			case MainPackage.PLAYER___ACCUSE:
				accuse();
				return null;
			case MainPackage.PLAYER___SUGGEST:
				suggest();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", color: ");
		result.append(color);
		result.append(", turnToken: ");
		result.append(turnToken);
		result.append(", personId: ");
		result.append(personId);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
