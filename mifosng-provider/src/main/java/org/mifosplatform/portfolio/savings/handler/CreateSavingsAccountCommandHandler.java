package org.mifosplatform.portfolio.savings.handler;

import org.mifosplatform.commands.handler.NewCommandSourceHandler;
import org.mifosplatform.infrastructure.core.api.JsonCommand;
import org.mifosplatform.infrastructure.core.data.CommandProcessingResult;
import org.mifosplatform.portfolio.savings.service.SavingsAccountWritePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreateSavingsAccountCommandHandler implements NewCommandSourceHandler {

    private final SavingsAccountWritePlatformService savingAccountWritePlatformService;

    @Autowired
    public CreateSavingsAccountCommandHandler(final SavingsAccountWritePlatformService savingAccountWritePlatformService) {
        this.savingAccountWritePlatformService = savingAccountWritePlatformService;
    }

    @Transactional
    @Override
    public CommandProcessingResult processCommand(final JsonCommand command) {
        return this.savingAccountWritePlatformService.createSavingAccount(command);
    }
}