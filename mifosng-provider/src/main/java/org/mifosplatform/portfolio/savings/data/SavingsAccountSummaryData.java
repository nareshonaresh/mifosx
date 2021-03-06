/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.savings.data;

import java.math.BigDecimal;

import org.mifosplatform.organisation.monetary.data.CurrencyData;

/**
 * Immutable data object representing loan summary information.
 */
@SuppressWarnings("unused")
public class SavingsAccountSummaryData {

    private final CurrencyData currency;
    private final BigDecimal totalDeposits;
    private final BigDecimal totalWithdrawals;
    private final BigDecimal totalWithdrawalFees;
    private final BigDecimal totalInterestEarned;
    private final BigDecimal totalInterestPosted;
    private final BigDecimal accountBalance;

    public SavingsAccountSummaryData(final CurrencyData currency, final BigDecimal totalDeposits, final BigDecimal totalWithdrawals,
            final BigDecimal totalWithdrawalFees, final BigDecimal totalInterestEarned, final BigDecimal totalInterestPosted,
            final BigDecimal accountBalance) {
        this.currency = currency;
        this.totalDeposits = totalDeposits;
        this.totalWithdrawals = totalWithdrawals;
        this.totalWithdrawalFees = totalWithdrawalFees;
        this.totalInterestEarned = totalInterestEarned;
        this.totalInterestPosted = totalInterestPosted;
        this.accountBalance = accountBalance;
    }
}