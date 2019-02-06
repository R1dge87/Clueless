/**
 */
package Clueless.impl;

import Clueless.Card;
import Clueless.MainPackage;
import Clueless.Solution;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Clueless.impl.SolutionImpl#getSolutionCardList <em>Solution Card List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionImpl extends MinimalEObjectImpl.Container implements Solution {
	/**
	 * The cached value of the '{@link #getSolutionCardList() <em>Solution Card List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionCardList()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> solutionCardList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MainPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Card> getSolutionCardList() {
		if (solutionCardList == null) {
			solutionCardList = new EObjectResolvingEList<Card>(Card.class, this, MainPackage.SOLUTION__SOLUTION_CARD_LIST);
		}
		return solutionCardList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MainPackage.SOLUTION__SOLUTION_CARD_LIST:
				return getSolutionCardList();
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
			case MainPackage.SOLUTION__SOLUTION_CARD_LIST:
				getSolutionCardList().clear();
				getSolutionCardList().addAll((Collection<? extends Card>)newValue);
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
			case MainPackage.SOLUTION__SOLUTION_CARD_LIST:
				getSolutionCardList().clear();
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
			case MainPackage.SOLUTION__SOLUTION_CARD_LIST:
				return solutionCardList != null && !solutionCardList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolutionImpl
